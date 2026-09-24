import "./Navbar.scss";

function Navbar ({brandName, searchText}){
    const baseurl = "/images/";

    return (
        <nav className="navbar">
        <div className="navbar-logo">
            <img src={`${baseurl}logo.jpg`} alt="logo image"/> 
            {brandName}
        </div>

        <div className="navbar-links">
            <button className="navbar-searchIcon" >
                <img src={`${baseurl}searchIcon.jpg`} alt="search icon"/>
                {searchText}
            </button>
            <a href="/">
            <img src={`${baseurl}HomeIcon.jpg`} alt="HomeIcon" />
            </a>
            <a href="/card">
                <img src={`${baseurl}addToCardIcon.jpg`} alt="CartIcon" />
            </a>
            <a href="/heart">
                <img src={`${baseurl}heartIcon.jpg`} alt="heartIcon" />
            </a>
            <a href="/login">
                <img src={`${baseurl}loginIcon.jpg`} alt="loginIcon" />
            </a>

        </div>
        </nav>
    )

}
export default Navbar;