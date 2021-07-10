import axios from "axios"
import { useEffect, useState } from "react"
import queryparser from "query-string"
import { Table } from 'reactstrap';
import Searchdistrict from "./searchdistrict";

function Search(props){
    var query= queryparser.parse(props.location.search)
    console.log("Query what we have searched for",query)
    var searchtext = query.q
    var[district,setDistrict]=useState([]);
    var [count, setCount] = useState();
    useEffect(function(){
        console.log("it will run only once")
        var apiurl ="http://localhost:8080/cowin/searchByDistrict/"+searchtext;
        axios({
            method:"get",
            url: apiurl
        }).then((response)=>{
            console.log("districts that we searched for are",response.data)
            setDistrict(response.data)
        },(error)=>{
            console.log("error from search api",error)
        })
    },[searchtext])
    return(
        <div>
         <div className="container">   
        <h1>Cowin website</h1>
        <Table varient="dark" striped class="text-center">
        <thead>
        <tr>
          <th><h2>List of All Vaccination Center in {district.districtName}</h2></th>
        </tr>
      </thead>
      <tbody>
      <tr align="center"><td>{district && district.length>0 && district.map((each,index)=>{
            return<Searchdistrict key={index} listData={each}/>
        })}</td>
        </tr>
      <tr align="center">
       <td><b>District:&nbsp;&nbsp;&nbsp;&nbsp;</b> <h6>{district.districtName}</h6></td></tr>
       <tr align="center">
       <td><b>Center: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b><h6> {district.center.centerName}</h6></td></tr>
       <tr align="center">
       <td><b>Booking date:</b> <h6>{district.center.slot.booking_date}</h6></td></tr>
       <tr align="center">
       <td> <b>Slot Available:&nbsp;&nbsp;&nbsp;&nbsp;</b>{!district.center.slot.booked_slot}
          {!count && <button type="button" class="btn btn-primary" onClick={() => setCount(prompt('Enter your mobile number'))}>Book Now</button>}
          {count && <button type="button" class="btn btn-secondary">Slot Booked</button>}
          <td><b>Your mobile number is:{count}</b></td>
           </td>
        </tr>
        
      </tbody>
      </Table>
      </div>
      </div>
    ) 
}
export default Search