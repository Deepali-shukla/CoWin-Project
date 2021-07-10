import React,{useEffect, useState} from "react";
import axios from "axios";
import base_url from "./bootapi";
import ListView from "./listview";
import { Table } from 'reactstrap';

const Alldistrict = () =>
{
    const[district,setDistrict] = useState([]);
    useEffect(()=>{document.title = "AllDistricts || coWin website";},[]);

    const getAlldistricts = () =>{
        axios.get(`${base_url}/cowin/viewDistrict`).then((response)=>{
            console.log(response.data);
            console.log("result has been loaded in console");
            setDistrict(response.data);
        },(error)=>{
           console.log(error);
        }

        );
    };

     useEffect(() => {getAlldistricts();}, []);
    //const [district,setDistrict]= useState([]);

    return(
        <div>
        <h1>Cowin website</h1>
        <Table varient="dark" striped class="text-center">
        <thead>
        <tr>
          <th><h2>List of All Vaccination Center in MP</h2></th>
        </tr>
      </thead>
      <tbody>
          <tr align="center"><td>{district && district.length>0 && district.map((each,index)=>{
            return<ListView key={index} listData={each}/>
        })}</td>
        </tr>
      </tbody>
      </Table>
      </div>
    )
}
export default Alldistrict;