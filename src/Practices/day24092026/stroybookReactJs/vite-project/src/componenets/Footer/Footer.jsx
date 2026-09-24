import "./Footer.scss";

function Footer ({brandname , content , about }){
     const baseurl = "/images/";
    return(
        <footer className="footer">
            <div className="footer-container">
                <div className="footer-brand">
                    <img src={`${baseurl}logo.jpg`}/>
                    <h2>{brandname}</h2>
                    <p>{content}</p>
                </div>
                        <div className="footer-column">
          <h3>{about}</h3>
          <a href="/about">About Us</a>
          <a href="/contact">Contact Us</a>
          <a href="/policy">Privacy Policy</a>
          <a href="/terms">Terms and Conditions</a>
        </div>

        
        <div className="footer-column">
          <h3>Useful Links</h3>
          <a href="/">Home</a>
          <a href="/profile">My Account</a>
          <a href="/cart">Cart</a>
          <a href="/cart">Whishlist</a>
          <a href="/help">Help & Support</a>
        </div>

        <div className="footer-column">
          <h3>Group Companies</h3>
          <a href="/">Mynthra</a>
          <a href="/flipkart">Flipkart</a>
          <a href="/amazon">Amazon</a>
          <a href="/messho">Messho</a>
        </div>

        <div className="footer-app">
          <h3>Download Our App</h3>

          <button>Google Play</button>

          <button>App Store</button>

          <h3>Follow Us</h3>

          <div className="footer-social">
            <a href="#">
                <img src={`${baseurl}facebookLogo.jpg`}/>
            </a>
            <a href="#">
                <img src= {`${baseurl}instagramLogo.jpg`}/>
            </a>
            <a href="#">
                <img src= {`${baseurl}twitterLogo.jpg`}/>
            </a>
          </div>
        </div>
      </div>

     
      <div className="footer-bottom">
        <p>© 2026 Shopssy. All rights reserved.</p>
            </div>


        </footer>

    )
}
export default Footer;