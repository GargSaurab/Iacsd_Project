import React from "react";
import '../Styles/HomeComponent.css'
import { Container } from "react-bootstrap";
import { useEffect,useState } from "react";
import {Button} from "react-bootstrap";

export default function HomeComponent()
{
    const[currentPictureIndex,setCurrentPictureIndex]=useState(0);

    const pictures = [
        {id: 1, src: '/images/image1.jpg', alt: 'Image 1'},
        {id: 2, src: '/images/image2.jpg', alt: 'Image 2'},
        {id: 3, src: '/images/image3.jpg', alt: 'Image 3'},
    ];

    useEffect(()=>{
        const interval = setInterval(()=>{
            setCurrentPictureIndex(prevIndex=>
                prevIndex===pictures.length - 1 ? 0 : prevIndex + 1
                );
        },3000);

        return() => clearInterval(interval);
    },[pictures.length]);

    const handleButtonClick =()=>{

    };
    
    return (
        <Container fluid className="p-0">
            <h1 className="text-center text-write">Welcome TO DawaKhana</h1>
            <img
            src={pictures[currentPictureIndex].src}
            alt={pictures[currentPictureIndex].alt}
            className="img-fkuid"
            style={{width: '100%', height: '100vh', objectFit:'cover'}}/>
            <div className="position-absolute top-50 start-50 translate-middle">
            
            <Button onClick={handleButtonClick}variant="primary">GET Started</Button> 
            </div>
        </Container>
    );
};

