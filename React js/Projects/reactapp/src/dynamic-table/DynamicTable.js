
import { useEffect } from "react";
import TableData from "./TableData";
function DynamicTable() {
    // get table column
    const column = Object.keys(TableData[0]);
    // get table heading data
    const ThData = () => {
        return column.map((data) => {//loop through table column data
            return <th key={data}>{data}</th>//for each key data(JSON), store it in a table head column
        })
    }
    // get table row data
    const tdData = () => {
        return TableData.map((data) => {//loop through table row data 
            return (
                <tr>
                    {
                        column.map((v) => {//for each column
                            return <td>{data[v]}</td>
                        })
                    }
                </tr>
            )
        })
    }
    return (
        <table className="table">
            <thead>
                <tr>{ThData()}</tr>
            </thead>
            <tbody>
                {tdData()}
            </tbody>
        </table>
    )
}
export default DynamicTable;