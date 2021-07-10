import {Link} from "react-router-dom";

function Home(props)
{
    var image1 = "img1.PNG";
    var image2 = "img2.PNG";

    var text =[];
    function getSearchText(event)
  {
    event.preventDefault()
    text= event.target.value
    console.log("Entered text",text)
  }
  function Searchdist(event)
  {
    event.preventDefault()
    console.log("text",text)
    if(text && text.length)
    {
      var url ='/search?q='+text
      alert(url)
      props.history.push(url)
    }
  } 
   return(
       <div>
           <div style={{width:"100%", height:"50px",backgroundColor:"#002147",color:"white",textAlign:"left",paddingLeft:"100px"}}>Ministry of Health and Family Welfare</div>
           <div>
           <img src={image1} alt="..." style={{width:"100%" ,height:"5em"}}></img>
           <img src={image2}  alt="..." style={{width:"100%" ,height:"24em"}}></img>
              <h4>Check your nearest vaccination center and slots availability</h4>
            </div>   
            <div className="container" style={{justifyContent:'center',width:"30%"}}>
            <form className="d-flex">           
            <input onChange={getSearchText} className="form-control me-2" type="search" placeholder="Search By District" aria-label="Search" style={{marginLeft: "-330px"}}></input>
            <Link to="/search"><button onClick={Searchdist} className="btn btn-primary" type="submit">Search</button></Link>&nbsp;&nbsp;
            </form>
           </div>
       </div>
   )
}
export default Home;