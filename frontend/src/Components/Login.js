import { Collapse, Container, Table } from 'react-bootstrap';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import { Link, useNavigate } from 'react-router-dom';
import '../Styles/LoginComponent.css'
import { useState } from 'react';
import PharmaService from '../Service/PharmacistService';
import CustomerService from '../Service/CustomerService';

const LoginComponent = () => {
  const [formDetails, setFormDetails] = useState(
    {
      username: "",
      password: ""
    })
  const [errors, setError] = useState({});
  const navigate = useNavigate();

  const handleLogin = () => {
    if (formDetails.username.match(/^emp/)) {
      PharmaService.getAuthorization(formDetails)
        .then((result) => {
          console.log(result);
          if (result.data) {
            console.log(result);
            navigate("/customer");
          }
          else {

            alert("Username or Password didn't match");
          }
        })
    }
    else {
      CustomerService.getAuthorization(formDetails)
        .then((result) => {
          if (result) {
            navigate("/custsampled");
          }
          else {
            alert("Username or Password didn't match");
          }
        })
    }
  }
  const newErrors = {};
  const handleChange = (event) => {
    let { name, value } = event.target
    setFormDetails({ ...formDetails, [name]: value })
    if (formDetails[name].trim() === '') {
      newErrors[name] = `${name}+is required`;
    }
  }

  if (Object.keys(newErrors).length > 0) {
    setError(newErrors);
    return;
  }

  return (
    <div className='center-screen login-page'>
    <Container className='custom-container'>
      <Row className='custom-row'>
        <Col md={7} lg={8} >
          <img src="/images/loginSideImage.jpg" alt="Background" className='custom-image' /></Col>
        <Col md={5} lg={4} >
          <div className='custom-login'>
            <Form>
              <div className="form-group ">
                <label htmlFor='username'>
                  Username/Email
                </label>
                <input type='text' className="form-control" name='username' id='username'
                  value={formDetails.username}
                  onChange={handleChange} />
              </div>
              <div className="form-group">
                <label htmlFor='pass'>
                  Password
                </label>
                <input type='text' className="form-control" name='pass' id='pass'
                  value={formDetails.password}
                  onChange={handleChange} />
              </div>
              <button type="button" className="btn btn-primary" onClick={handleLogin}>Login</button>
            </Form>
          </div>
        </Col>
      </Row>
    </Container>
    </div>
  );
}


export default LoginComponent;