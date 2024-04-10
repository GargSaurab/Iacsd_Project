import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import LoginModal from './Login';
import { useState } from 'react';
import { Image } from 'react-bootstrap';

function MainNavbar() {

  const [showLoginModal, setShowLoginModal] = useState(false);

  const handleShowLoginModal = () => setShowLoginModal(true);
  const handleCloseLoginModal = () => setShowLoginModal(false);
  return (
    <div className="h-screen flex flex-col items-center gap-6 Obg-[#14161b] ■text-white">
      <Navbar expand="lg" className="bg-body-tertiary">
        <Container fluid>
          <Navbar.Brand href="/">
            <Image src="/images/DawaKhana.png" alt="DawaKhana Logo" width="50" height="50" />
          </Navbar.Brand>
          <Navbar.Toggle aria-controls="navbarScroll" />
          <Navbar.Collapse id="navbarScroll">
            <Nav
              className="me-auto my-2 my-lg-0"
              style={{ maxHeight: '100px', width: '100%' }}
              navbarScroll
            >
              <Nav.Link href="/">Home</Nav.Link>
              <Nav.Link href="trial">Link</Nav.Link>
              <Nav.Link href="bill">Bill</Nav.Link>
              <NavDropdown title="Link" id="navbarScrollingDropdown">
                <NavDropdown.Item href="#action3">Action</NavDropdown.Item>
                <NavDropdown.Item href="#action4">
                  Another action
                </NavDropdown.Item>
                <NavDropdown.Divider />
                <NavDropdown.Item href="#action5">
                  Something else here
                </NavDropdown.Item>
              </NavDropdown>

              <button type="button" className="btn btn-success" onClick={() => setShowLoginModal(true)}
                style={{ marginLeft: '800px' }}>Login</button>

            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      {showLoginModal && <LoginModal onClose={() =>setShowLoginModal(false)}/>}
    </div>
  )
}

export default MainNavbar;