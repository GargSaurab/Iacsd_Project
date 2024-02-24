import React from "react";
import '../Styles/BillComponent.css';
import { Form,Row,Col, Button } from "react-bootstrap";

const BillComponent=()=>{
return(<div className="billComponent">
    <div className="top-panel">
    
    <Form.Group className='mb-4'>
        <Row>
            <Col md={9}>
                <Row>
                    <Col sm={1}>
                        <Form.Label>Invoice:</Form.Label>
                    </Col>
                    
                    <Col sm={2}>
                        <Form.Control size="sm" className="fixed-width" type='text' />
                    </Col>

                    <Col sm={1}>
                        <Form.Label>Date:</Form.Label>
                    </Col>
                    
                    <Col sm={2}>
                        <Form.Control size="sm" className="fixed-width" type='date'/>
                    </Col>

                    <Col sm={1}>
                        <Form.Label>Bill Type:</Form.Label>
                    </Col>
                    
                    <Col sm={2}>
                        <Form.Select size="sm">
                            <option value='select'>--Select--</option>
                            <option value='cash'>CASH</option>
                            <option value='upi'>UPI</option>
                            <option value='card'>CARD</option>
                        </Form.Select>
                    </Col>
                </Row>    
            </Col>

            <Col sm={1}>
                <Form.Label>Remarks:</Form.Label>
            </Col>

            <Col sm={2}>
                <Form.Control size='sm' className="fixed-width" type="text"></Form.Control>
            </Col>
        </Row>

        <Row>
            <Col md={9}>
                <Row>
                    <Col sm={1}>
                        <Form.Label>Search</Form.Label>
                    </Col>

                    <Col sm={6}>
                        <Form.Control size="sm" className="fixed-width" type='text'></Form.Control>
                    </Col>

                    <Col>
                        <Button variant="Primary" size="sm">History</Button>
                    </Col>
                </Row>
            </Col>

            <Col sm={1}>
                <Form.Label>Copy Invoice</Form.Label>
            </Col>

            <Col sm={2}>
                <Form.Control size='sm' className="fixed-width" type="text"></Form.Control>
            </Col>
        </Row>

        <Row>
            <Col md={9}>
                <Row>
                    <Col sm={1}>
                        <Form.Label>Mob No.</Form.Label>
                    </Col>

                    <Col sm={2}>
                        <Form.Control size="sm" className="fixed-width" type='text'></Form.Control>
                    </Col>

                    <Col sm={1}>
                        <Form.Label>Doctor</Form.Label>
                    </Col>

                    <Col sm={2}>
                        <Form.Control size="sm" className="fized-Width" type='text'></Form.Control>
                    </Col>
                </Row>
            </Col>

            <Col sm={1}>
                <Form.Label>Dr. Regd. No</Form.Label>
            </Col>

            <Col sm={2}>
                <Form.Control size='sm' className="fixed-width" type="text"></Form.Control>
            </Col>
        </Row>

        <Row>
            <Col md={9}>
                <Row>
                    <Col sm={1}>
                        <Form.Label>Address:</Form.Label>
                    </Col>

                    <Col sm={2}>
                        <Form.Control size='sm' className="fixed-width" as="textarea" rows="2"></Form.Control>
                    </Col>

                    <Col sm={1}>
                        <Form.Label>GST No.</Form.Label>
                    </Col>

                    <Col sm={2}>
                        <Form.Control size='sm' className="fixed-width" type='text'></Form.Control>
                    </Col>
                </Row>
            </Col>

            <Col sm={1}>
                <Form.Label>Other Details</Form.Label>
            </Col>

            <Col sm={2}>
                <Form.Control size='sm' className="fixed-width" type="text"></Form.Control>
            </Col>
        </Row>
    </Form.Group>

    </div>
    
    
    <div className="middle-panel">
        <Row>
            <Col sm={6}>
                <Form.Group className='mb-4'>
                    <Form.Label>Filter Type</Form.Label>
                    <Form.Check inline label="Product Code" type='radio'id='productCode'name='filter'/>
                    <Form.Check inline label="Product Name" type='radio'id='productName'name='filter'/>
                    <Form.Check inline label="Generic Name" type='radio'id='genericName'name='filter'/>
                </Form.Group>
            </Col>
        </Row>

        <Row>
            <Col sm={.75}>
                <Form.Label>Product Name</Form.Label>
            </Col>

            <Col sm={.75}>
                <Form.Control size='sm' className="fixed-width" type='text'></Form.Control>
            </Col>

            <Col sm={.75}>
                <Form.Label>Code</Form.Label>
            </Col>

            <Col sm={.75}>
                <Form.Control size='sm' className="fixed-width" type='text'></Form.Control>
            </Col>

            <Col sm={.75}>
                <Form.Label>Batch</Form.Label>
            </Col>

            <Col sm={.75}>
                <Form.Control size='sm' className="fixed-width" type='text'></Form.Control>
            </Col>

            <Col sm={.75}>
                <Form.Label>Pack Size</Form.Label>
            </Col>

            <Col sm={.75}>
                <Form.Control size='sm' className="fixed-width" type='text'></Form.Control>
            </Col>

            <Col sm={.75}>
                <Form.Label>Rate</Form.Label>
            </Col>

            <Col sm={.75}>
                <Form.Control size='sm' className="fixed-width" type='text'></Form.Control>
            </Col>

            <Col sm={.75}>
                <Form.Label>Location</Form.Label>
            </Col>

            <Col sm={.75}>
                <Form.Control size='sm' className="fixed-width" type='text'></Form.Control>
            </Col>
            
            <Col sm={.75}>
                <Form.Label>Quantity</Form.Label>
            </Col>

            <Col sm={.75}>
                <Form.Control size='sm' className="fixed-width" type='text'></Form.Control>
            </Col>

            <Col sm={.75}>
                <Form.Label>Discount</Form.Label>
            </Col>

            <Col sm={.75}>
                <Form.Control size='sm' className="fixed-width" type='text'></Form.Control>
            </Col>

            <Col sm={.75}>
                <Form.Label>Address</Form.Label>
            </Col>

            <Col>
                <Button variant="Primary" size="sm">Add</Button>
            </Col>

        </Row>
        
    </div>

    <div className="bottom-panel">
<h1>Bottom</h1>
    </div>
</div>
);
}

export default BillComponent;
