import { Button, Container } from 'react-bootstrap';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';


function Login() {
  return (
    <Container className="d-flex justify-content-center align-items-center ">
    <Form>
      <Form.Group as={Row} className="mb-3" controlId="formPlaintextEmail">
        <Form.Label column sm="3">
          Email
        </Form.Label>
        <Col sm="10">
          <Form.Control />
        </Col>
      </Form.Group>

      <Form.Group as={Row} className="mb-3" controlId="formPlaintextPassword">
        <Form.Label column sm="3">
          Password
        </Form.Label>
        <Col sm="10">
          <Form.Control type="password" placeholder="Password" />
        </Col>
      </Form.Group>
      <Form.Group as={Row} className="mb-3" controlId="formPlaintextPassword">
        <Col sm="5">
        <button type="submit" class="btn btn-outline-success">Login</button>
        </Col>
        <Col sm="5">
        <button type="reset" class="btn btn-outline-danger">Cacel</button>
        </Col>
      </Form.Group>
    </Form>
    </Container>
  );
}

export default Login;