import React from 'react';
import { Container, Row, Col, Form, Button } from 'react-bootstrap';

function Registration() {
  return (
    <Container fluid>

      <Row className='justify-content-center align-items-center m-5'>

        <Col md={6}>
          <Form>
            <h3 className="fw-bold mb-4 pb-2 pb-md-0 mb-md-5">Registration Form</h3>

            <Row>
              <Col>
                <Form.Group className='mb-4'>
                  <Form.Label>First Name</Form.Label>
                  <Form.Control size='lg' type='text' />
                </Form.Group>
              </Col>

              <Col>
                <Form.Group className='mb-4'>
                  <Form.Label>Last Name</Form.Label>
                  <Form.Control size='lg' type='text' />
                </Form.Group>
              </Col>
            </Row>

            <Row>
              <Col>
                <Form.Group className='mb-4'>
                  <Form.Label>Birthday</Form.Label>
                  <Form.Control size='lg' type='text' />
                </Form.Group>
              </Col>

              <Col>
                <Form.Group className='mb-4'>
                  <Form.Label>Gender</Form.Label>
                  <div>
                    <Form.Check inline label="Female" type='radio' id='inlineRadio1' />
                    <Form.Check inline label="Male" type='radio' id='inlineRadio2' />
                    <Form.Check inline label="Other" type='radio' id='inlineRadio3' />
                  </div>
                </Form.Group>
              </Col>
            </Row>

            <Row>
              <Col>
                <Form.Group className='mb-4'>
                  <Form.Label>Email</Form.Label>
                  <Form.Control size='lg' type='email' />
                </Form.Group>
              </Col>

              <Col>
                <Form.Group className='mb-4'>
                  <Form.Label>Phone Number</Form.Label>
                  <Form.Control size='lg' type='text' />
                </Form.Group>
              </Col>
            </Row>

            <Button className='mb-4' size='lg'>Submit</Button>
          </Form>
        </Col>

      </Row>
    </Container>
  );
}

export default Registration;
