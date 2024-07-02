import React from "react";
import "../Styles/NavbarComponent.css";
import { Image, Button } from "react-bootstrap";

function navbar() {
  return (
    <div className="nav">
      <div className="navLeft">
        <div className="img">
          <Image src="/images/DawaKhanaLogo.svg" alt="DawaKhana Logo" />
        </div>
        <div>Products</div>
        <div>About Us</div>
        <div>Contact Us</div>
      </div>

      <div className="navRight">
        <div className="signIn">
        <Image src="/images/Avatar.svg" alt="Login button" />
         Hello! Sign In
        </div>   

        <div className="cart">
          <Image src="/images/ShopingCart.svg" alt="Login button" />
          <span>Cart</span>
        </div>
      </div>
    </div>
  );
}

export default navbar;
