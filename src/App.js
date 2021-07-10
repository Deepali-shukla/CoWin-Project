//import logo from './logo.svg';
import {BrowserRouter as Router,Route} from "react-router-dom";
import './App.css';
import Home from './Components/home';
 import Search from "./Components/search";
import Alldistrict from './Components/alldistrict';
function App() {
  return (
    <div className="App">
     <Router>
       <Route exact path="/home" component={Home}></Route>
       <Route exact path="/search" component={Search}></Route> 
       <Route exact path="/allDistrict" component={Alldistrict}></Route>
     </Router>
    </div>
  );
}

export default App;
