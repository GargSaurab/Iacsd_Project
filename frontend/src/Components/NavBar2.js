import React from "react";
import "../Styles/NavbarComponent.css";
import { Image } from "react-bootstrap";
import { useState } from "react";
import LoginModal from "./Login";

function Navbar() {
  const [showLoginModal, setShowLoginModal] = useState(false);

  const handleShowLoginModal = () => setShowLoginModal(true);
  const handleCloseLoginModal = () => setShowLoginModal(false);

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
        <div className="signIn" onClick={() => setShowLoginModal(true)}>
          <Image src="/images/Avatar.svg" alt="Login button" />
          Hello! Sign In
        </div>

        <div className="cart">
          <Image src="/images/ShopingCart.svg" alt="Login button" />
          <span>Cart</span>
        </div>
      </div>
      {showLoginModal && (
        <LoginModal onClose={() => setShowLoginModal(false)} />
      )}
    </div>
  );
}

export default Navbar;
