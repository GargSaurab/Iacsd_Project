import React, { useState } from 'react';
import { Container, Row, Col, Form, Button } from 'react-bootstrap';

function Registration() {
  // State to manage form data and errors
  const [formData, setFormData] = useState({
    firstName: '',
    lastName: '',
    birthday: '',
    gender: '',
    email: '',
    phoneNumber: '',
  });

  const [errors, setErrors] = useState({});

  // Function to handle form submission
  const handleSubmit = (e) => {
    e.preventDefault();
    
    // Validate the form data
    const newErrors = {};
    // Add your validation logic here
    if (formData.firstName.trim() === '') {
      newErrors.firstName = 'First Name is required';
    }
    // Add similar validation for other fields

    // If there are errors, set the state and return
    if (Object.keys(newErrors).length > 0) {
      setErrors(newErrors);
      return;
    }

    // If no errors, proceed with form submission logic
    // ...

    // Clear errors and reset form data after submission
    setErrors({});
    setFormData({
      firstName: '',
      lastName: '',
      birthday: '',
      gender: '',
      email: '',
      phoneNumber: '',
    });
  };

  // Function to handle input changes
  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));

    // Clear the error message when the user starts typing
    setErrors((prevErrors) => ({
      ...prevErrors,
      [name]: '',
    }));
  };

  return (
    <Container fluid>
      <Row className='justify-content-center align-items-center m-5'>
        <Col md={6}>
          <Form onSubmit={handleSubmit}>
            {/* ... (other form elements) */}
            
            {/* Display error messages */}
            {errors.firstName && <div className="text-danger">{errors.firstName}</div>}
            {/* Add similar lines for other fields */}

            <Button className='mb-4' size='lg' type="submit">
              Submit
            </Button>
          </Form>
        </Col>
      </Row>
    </Container>
  );
}

export default Registration;
