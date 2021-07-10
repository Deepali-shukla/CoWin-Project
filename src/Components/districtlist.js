import axios from 'axios';
import { useState } from 'react';
//import data from "./data"
import ListView from "./listview"
function Districtlist()
 {
     var [district,setDistrict] = useState(district)
     //if(!district.length>0){
     axios({
         method:'get',
         url:"http://localhost:8080/cowin/viewDistrict"
     }).then((response)=>{
         console.log("response from view district api",response)
         district = response.data.data
         setDistrict(response.data.data)
     },(error)=>{
         console.log("Error from view District api",error)
     })
    //}
     return(
     <div className="row">
         <div className="row">
        {/* {this.state.cakes.map(function (each) {
          return <Cake cakeData={each} />
        })}  */}
        {district && district.length>0 && district.map((each,index)=>{
            return<ListView key={index} listData={each}/>
        })}
      </div>
    </div>
     )
 }
 export default Districtlist;