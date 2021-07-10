import React from 'react';
//import {Link} from "react-router-dom";
function Searchdistrict(props) {
    
  return (
    <div>
       <tr>
       <td><b>District:</b> {props.listData.districtName}</td>&nbsp;&nbsp;
       <td><b>Center:</b> {props.listData.center.centerName}
           <td><b>Booking date:</b> {props.listData.center.slot.booking_date}</td>&nbsp;&nbsp;
            <td>{props.listData.center.slot.booked_slot}
          {!props.listData.center.slot.booked_slot && <button type="button" class="btn btn-primary">Book Now</button>}
          {props.listData.center.slot.booked_slot && <button type="button" class="btn btn-secondary">Slot Booked</button>}
           </td>
           <hr/>
       </td>
        </tr>     
        </div>
  );
}

export default Searchdistrict;