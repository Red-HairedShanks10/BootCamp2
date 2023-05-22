--------------------------------------------------------------
-- Practical SQL: A Beginner's Guide to Storytelling with Data
-- by Anthony DeBarros

-- Chapter 11 Code Examples
--------------------------------------------------------------

-- Listing 11-1: Extracting components of a timestamp value using date_part()

SELECT
    date_part('year', '2019-12-01 18:37:12 EST'::timestamptz) AS "year",
    date_part('month', '2019-12-01 18:37:12 EST'::timestamptz) AS "month",
    date_part('day', '2019-12-01 18:37:12 EST'::timestamptz) AS "day",
    date_part('hour', '2019-12-01 18:37:12 EST'::timestamptz) AS "hour",
    date_part('minute', '2019-12-01 18:37:12 EST'::timestamptz) AS "minute",
    date_part('seconds', '2019-12-01 18:37:12 EST'::timestamptz) AS "seconds",
    date_part('timezone_hour', '2019-12-01 18:37:12 EST'::timestamptz) AS "tz",
    date_part('week', '2019-12-01 18:37:12 EST'::timestamptz) AS "week",
    date_part('quarter', '2019-12-01 18:37:12 EST'::timestamptz) AS "quarter",
    date_part('epoch', '2019-12-01 18:37:12 EST'::timestamptz) AS "epoch";


-- Listing 11-2: Three functions for making datetimes from components

-- make a date
SELECT make_date(2018, 2, 22);
-- make a time
SELECT make_time(18, 4, 30.3);
-- make a timestamp with time zone
SELECT make_timestamptz(2018, 2, 22, 18, 4, 30.3, 'Europe/Lisbon');


-- Listing 11-3: Comparing current_timestamp and clock_timestamp() during row insert

CREATE TABLE current_time_example (
    time_id bigserial,
    current_timestamp_col timestamp with time zone,
    clock_timestamp_col timestamp with time zone
);

INSERT INTO current_time_example (current_timestamp_col, clock_timestamp_col)
    (SELECT current_timestamp,
            clock_timestamp()
     FROM generate_series(1,1000));

SELECT * FROM current_time_example;

-- Time Zones

-- Listing 11-6: Setting the time zone for a client session

SET timezone TO 'AFRICA/Johannesburg';

CREATE TABLE time_zone_test (
    test_date timestamp with time zone
);
INSERT INTO time_zone_test VALUES ('2020-01-01 14:00');

SELECT test_date
FROM time_zone_test;

SET timezone TO 'Asia/Seoul';

SELECT test_date
FROM time_zone_test;

SELECT test_date AT TIME ZONE 'Asia/Seoul'
FROM time_zone_test;


-- Math with dates!

SELECT '9/30/1929'::date - '9/27/1929'::date;
SELECT '9/30/1929'::date + '5 years'::interval;



-- Listing 11-8: Counting taxi trips by hour

SELECT
    date_part('hour', tpep_pickup_datetime) AS trip_hour,
    count(*)
FROM nyc_yellow_taxi_trips_2016_06_01
GROUP BY trip_hour
ORDER BY trip_hour;



-- Listing 11-10: Calculating median trip time by hour

SELECT
    date_part('hour', tpep_pickup_datetime) AS trip_hour,
    percentile_cont(.5)
        WITHIN GROUP (ORDER BY
            tpep_dropoff_datetime - tpep_pickup_datetime) AS median_trip
FROM nyc_yellow_taxi_trips_2016_06_01
GROUP BY trip_hour
ORDER BY trip_hour;

-- Listing 11-11: Creating a table to hold train trip data

SET timezone TO 'US/Central';

CREATE TABLE train_rides (
    trip_id bigserial PRIMARY KEY,
    segment varchar(50) NOT NULL,
    departure timestamp with time zone NOT NULL,
    arrival timestamp with time zone NOT NULL
);

INSERT INTO train_rides (segment, departure, arrival)
VALUES
    ('Chicago to New York', '2017-11-13 21:30 CST', '2017-11-14 18:23 EST'),
    ('New York to New Orleans', '2017-11-15 14:15 EST', '2017-11-16 19:32 CST'),
    ('New Orleans to Los Angeles', '2017-11-17 13:45 CST', '2017-11-18 9:00 PST'),
    ('Los Angeles to San Francisco', '2017-11-19 10:10 PST', '2017-11-19 21:24 PST'),
    ('San Francisco to Denver', '2017-11-20 9:10 PST', '2017-11-21 18:38 MST'),
    ('Denver to Chicago', '2017-11-22 19:10 MST', '2017-11-23 14:50 CST');

SELECT * FROM train_rides;

-- Listing 11-12: Calculating the length of each trip segment

SELECT segment,
       to_char(departure, 'YYYY-MM-DD HH12:MI a.m. TZ') AS departure,
       arrival - departure AS segment_time
FROM train_rides;



-- Listing 11-14: Better formatting for cumulative trip time

SELECT segment,
       arrival - departure AS segment_time,
       sum(date_part('epoch', (arrival - departure)))
           OVER (ORDER BY trip_id) * interval '1 second' AS cume_time
FROM train_rides;
