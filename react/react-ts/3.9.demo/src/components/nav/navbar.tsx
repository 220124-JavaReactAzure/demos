import { Link } from "react-router-dom";

const Navbar = () => {
    return (
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <div  id="navbarSupportedContent">
                <ul className="navbar-nav mr-auto">
                    <li className="nav-item">
                        <Link className = "nav-link" to='/'>Home</Link>
                    </li>
                    <li className="nav-item">
                        <Link className = "nav-link" to='/add'>Add</Link>
                    </li>
                    <li className="nav-item">
                        <Link className = "nav-link" to='/view'>View Players</Link>
                    </li>
                    <li className="nav-item">
                        <Link className = "nav-link" to='/number/1'>Number</Link>
                    </li>
                </ul>
            </div>
        </nav>
    )
}

export default Navbar;