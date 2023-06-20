import Tabs from "./Tabs";
import Items from "./Items";
import Data from "./Data";
import { useState } from "react";


function Gallery() {
    //declare a state//pass Data component in useState()
    const [data, setData] = useState(Data);
    const categoryData = Data.map((value) => {
        return value.category
    });
    const tabsData = ["all", ...new Set(categoryData)];//catergoryData will be converted into object set, using new-Set()

    //filterCatergory() will be used as an event handler to help display tutorials by their catergory
    const filterCategory = (category) => {
        if (category == "all") {//if category is all
            setData(Data);//set to every object in Data file
            return;
        }
        const filteredData = Data.filter((value) => {
            return value.category == category;//return category data of that selected category
        })
        //set Data to what is returned by filteredData
        setData(filteredData);
    }

    return (
        <div className="container">
            <div className="row">
                <div className="col-sm-1">
                </div>
                <div className="col-sm-10">
                    {/** */}
                    <Tabs filterCategory={filterCategory} tabsData={tabsData} />
                    {/**pass data as props to Items component */}
                    <Items data={data} />
                </div>
                <div className="col-sm-1">
                </div>
            </div>
        </div>
    )
}
export default Gallery;