<<<<<<< Updated upstream
import { Collapse, Container, Table } from 'react-bootstrap';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import { Link, useNavigate } from 'react-router-dom';
=======
import {Container} from 'react-bootstrap';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import {useNavigate } from 'react-router-dom';
>>>>>>> Stashed changes
import '../Styles/LoginComponent.css'
import { useState } from 'react';
import PharmaService from '../Service/PharmacistService';
import CustomerService from '../Service/CustomerService';

const LoginComponent = () => {
  const [formDetails, setFormDetails] = useState(
    {
<<<<<<< Updated upstream
      username: "",
      password: ""
=======
      Username: "",
      Password: ""
>>>>>>> Stashed changes
    })
  const [errors, setError] = useState({});
  const navigate = useNavigate();

  const handleLogin = () => {
<<<<<<< Updated upstream
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
=======

    setError({}); // resets the login error after login click

    if(formDetails.username?.trim()==='' || formDetails.Password?.trim()==='')
    {
        setError({...errors,Login:"Please fill all the fields"});

        return;
    }
  
    if (formDetails.username?.match(/^emp/)) {
      PharmaService.getAuthorization(formDetails)
        .then((result) => {
          console.log(result);
          if (result.data) {
            console.log(result);
            navigate("/customerlist");
          }
          else {
          setError({...errors,Login:"Username or Password didn't match"});
          }
        })
    }
    else {
      CustomerService.getAuthorization(formDetails)
        .then((result) => {
          if (result.data) {
            navigate("/customer");
          }
          else {
            setError({...errors,Login:"Username or Password didn't match"});
>>>>>>> Stashed changes
          }
        })
    }
  }
<<<<<<< Updated upstream
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
=======

  const newErrors = {...errors};

  const handleChange = (event) => {
    let { name, value } = event.target
    setFormDetails({ ...formDetails, [name]: value });
    if (value.trim() === '') {
      newErrors[name] = `${name} is required`;
    }
    else {
      newErrors[name] = null; // Clear the error message if the field is not empty
  }
  setError(newErrors);
>>>>>>> Stashed changes
  }

  return (
    <div className='center-screen login-page'>
<<<<<<< Updated upstream
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
=======
            <table>
                <tbody>
                    <tr>
                        <td colSpan="2">
                            <img src="/images/loginSideImage.jpg" alt="Background" className='custom-image' />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label htmlFor='Username'>Username/Email</label>
                        </td>

                        <td>
                            {errors.Username && <div className="error">{errors.Username}</div>}
                        </td>
                     </tr>

                     <tr>  
                     <td colSpan="2">
                            <input
                                type='text'
                                className="form-control"
                                name='Username'
                                id='Username'
                                value={formDetails.Username}
                                onChange={handleChange}
                                onBlur={handleChange}
                            />
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            <label htmlFor='Password'>Password</label>
                        </td>
                        <td>
                            {errors.Password && <div className="error">{errors.Password}</div>}
                        </td>
                   </tr> 
                  
                   <tr>
                        <td colSpan="2">
                            <input
                                type='password'
                                className="form-control"
                                name='Password'
                                id='Password'
                                value={formDetails.Password}
                                onChange={handleChange}
                                onBlur={handleChange}
                            />
                        </td>
                    </tr>

                    <tr>
                        <td colSpan="2" align="center">
                            <button type="button" className="btn btn-primary" onClick={handleLogin}>Login</button>
                        </td>
                    </tr>

                    <tr>
                        <td colSpan="2" align="center">
                        {errors.Login && <div className="error">{errors.Login}</div>}
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
>>>>>>> Stashed changes
  );
}


export default LoginComponent;