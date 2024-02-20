import { Container } from 'react-bootstrap';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import { Link, Navigate } from 'react-router-dom';
import '../Styles/LoginComponent.css'
import { useState } from 'react';
import PharmaService from '../Service/PharmacistService';
import CustomerService from '../Service/CustomerService';

const LoginComponent=()=> {
    const [username,setUsername]=useState('');
    const [password,setPassword]=useState('');

    const handleLogin=()=>{
         if(username.match(/^emp/))
         {
              PharmaService.getAuthorization(username,password)
              .then((result)=>{
                if(result)
                {
                    Navigate("/pharmacist");
                }
                else{
                   alert("Username or Password didn't match");
                }
              })
         }
         else
         {
               CustomerService.getAuthorization()
               .then((result)=>
               {
                  if(result)
                  {
                    Navigate("/customer");
                  }
                  else{
                    alert("Username or Password didn't match");
                  }
               })
         }
    }

  return (
    <Container className="d-flex justify-content-center align-items-center ">
    <Form>
      <Form.Group as={Row} className="mb-3" controlId="formPlaintextEmail">
        <Form.Label column sm="3">
          Email
        </Form.Label>
        <Col sm="10">
          <Form.Control type='text'
          placeholder='Enter username'
          value={username}
          onChange={(e)=>setUsername(e.target.value)} />
        </Col>
      </Form.Group>

      <Form.Group as={Row} className="mb-3" controlId="formPlaintextPassword">
        <Form.Label column sm="3">
          Password
        </Form.Label>
        <Col sm="10">
          <Form.Control type="password" placeholder="Password" 
          value={password}
          onChange={(e)=> setPassword(e.target.value)}/>
        </Col>
      </Form.Group>
      <Form.Group as={Row} className="mb-3 center" controlId="formPlaintextPassword" style={{ textAlign: 'center' }}>
        <Col sm="5">
        <button type="button" className="btn btn-outline-success" onClick={handleLogin}>Login</button>
        </Col>
        <Col sm="5">
        <button type="reset" className="btn btn-outline-danger">Cacel</button>
        </Col>
      </Form.Group>
      <Form.Group as={Row} className="mb-3 " controlId="formPlaintextPassword" style={{ textAlign: 'center' }}>
      <Link to="/register" >don't have an account</Link>
      </Form.Group>

    </Form>
    </Container>
  );
}

export default LoginComponent;