<%@include file="index.html"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" 
          content="width=device-width, 
                   initial-scale=1" />
  
    <!-- Bootstrap CSS -->
    <link
      href=
"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity=
"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
      crossorigin="anonymous"/>
    <link rel="stylesheet"
          href="style1.css" />
    <link rel="preconnect" 
          href="https://fonts.gstatic.com" />
    <link
      href=
"https://fonts.googleapis.com/css2?family=Roboto+Condensed&display=swap"
      rel="stylesheet"
    />
    
    <title>GFG</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800;900&display=swap');
      .bs-example {
      margin: 0px;

    }

    .navbar-brand {
      font-size: 20px;
      font-family: sans-serif;

    }
    #banner
    {
        background-color:#0a193d;
    }
    .r1{
        height:500px;
        width:100%;
        background-color:red;
        float:left;
    }
   
    
    #footer {
  
   left: 0;
   bottom:0;
   width: 100%;
   background-color: #FF0018;
   color: white;
   text-align: center;
   height:50px;
    }
   
        .xyz{
          margin-bottom: 0px;
        
          background-size: cover;
          background-repeat: no-repeat;
        }
        #service{
            background-color:#eee;
        }
      </style>
      
</head>


<body>
 <div class="bs-example">
    <nav style="background-color: #FF0018;" class="navbar navbar-expand-md navbar-dark fixed-top">
      <a href="/" class="navbar-brand"><i class="fas fa-heartbeat"></i>&nbsp; Blood Bank Management System</a>
      <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse" >


        <div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" style="color: white;" href="index.jsp"><i class="fas fa-home"></i>&nbsp; Home</i></a>
                </li>
               
                <li class="nav-item">
                    <a class="nav-link" style="color: white;" href="patientLogin.jsp"><i class="fas fa-procedures"></i>&nbsp; Patient</i></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" style="color: white;" href="donorLogin.jsp"><i class="fas fa-user"></i>&nbsp; Donor</i></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" style="color: white;" href="adminLogin.jsp"><i class="fas fa-user-shield"></i>&nbsp; Admin</i></a>
                </li>
               
            </ul>
        </div>




      </div>
    </nav>
  </div> 
  
  
   <!-- <section id="navbar">
      <nav class="navbar navbar-expand-lg navbar-light">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">
              Blood Bank Management System
            </a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" 
               id="navbarSupportedContent">
            <ul class="navbar-nav m-auto">
              <li class="nav-item">
                <a class="nav-link active" 
                   aria-current="page" 
                   href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" 
                   href="#service">Services</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" 
                   href="#about">About Us</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" 
                   href="#product">Products</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" 
                   href="#social">Contact Us</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </section>
  -->
    <!-- banner -->
    <section id="banner">
      <div class="container-fluid" id="banner-container">
        <div class="row" id="banner-row">
          <div class="col-md-6" id="banner-col">
            <h3 style="color:white; text-align: center;">
                Donate <font style="color:red">BLOOD</font> To Save Life
            </h3>
              
<p>
              Your Financial Gift can help a thousand children who Struggle from illness
            </p>
  
            <div class="d-grid gap-2 d-md-flex justify-content-center">
              <a class="btn btn-primary" 
                 href="contactus.jsp" 
                 role="button">Contact Us</a>
              <a class="btn btn-primary" 
                 href="registration.jsp" 
                 role="button">Register here!</a>
            </div>
           
          </div>
          <div class="col-md-6" id="banner-col2">
            <img
              class="img-responsive rounded mx-auto d-block"
              src="images/3.png"
              alt="logo" style="height:200px; width:250px;"
            />
          </div>
        </div>
      </div>
    </section>
  
    <!-- services -->
    <section id="service">
      <h1 class="text-center">Why To Donate Blood</h1>
      <div class="container-fluid" id="service-container">
        <div class="row" id="banner-row">
          <div class="col-md-4" id="service-col1">
            <img src="images/12.jpg" class="img-fluid rounded mx-auto d-block" alt="..." style="height:200px;width:300px;" /><br/><br/>
           
            <center><h4>Reason First..</h4></center>
        
        <p style="text-align:justify;">Donating blood has benefits for your emotional and physical health.According 
           to a report by the Mental Health Foundation, helping others can:reduce stress
           improve your emotional well-being,benefit your,healing body and give pure positive
           thought.
  </p>

 <a href="https://www.healthline.com/health/benefits-of-donating-blood#benefits" 
    class="btn btn-primary btn-lg">Know more..</a>
        
          </div>
  
          
          <div class="col-md-4" id="service-col2">
            <img
              src="images/21.jpg"
              class="img-fluid rounded mx-auto d-block"
              alt="..." style="height:200px;width:300px;"
            /><br/><br/>
            <center><h4>Reason Second..</h4></center>
       
            <p style="text-align:justify;">Maintaining diversity in the blood supply is essential. 
           Some blood types are quite rare and are likeliest to be
           found among people with shared ancestral origins. Visit
           our Blood and Diversity page for more information on the
           need for diversity in the blood supply.</p>
        <a href="https://www.redcrossblood.org/local-homepage/news/article/blood-donation-importance.html"
           class="btn btn-primary btn-lg">Know more..</a>
          </div>
          <div class="col-md-4" id="service-col3">
            <img
              src="images/29.jpg"
              class="img-fluid rounded mx-auto d-block"
              alt="..." style="height:200px;width:300px;"
            /><br/><br/>
            <center><h4>Reason Third..</h4></center>
       
        <p style="text-align:justify;">One donation can help save the lives of up to three people. It?s a truly selfless act, Eder says.There?s personal satisfaction that you may have saved someone life. The fact that you are healthy and can do it is its own reward.Donate Blood to be pour person of the world.</p>
        <a href="https://www.redcrossblood.org/local-homepage/news/article/blood-donation-importance.html" class="btn btn-primary btn-lg">Know more..</a>
       
  
          </div>
        </div>
      </div>
    </section>
    <hr />
 
     
    <!-- about Us -->
    <section id="about">
        <h1 class="text-center" style="margin-top:0px;"><b>About Us</b></h1>
      <div class="container-fluid" id="about-container">
        <div class="row" id="banner-row">
          <div class="col-md-6" id="about-col">
              <h3 style="color:red;">Let us Know more about us!</h3>
            <p style="text-align:justify;">Blood Bank Management System is a Very useful for the today' s life of human being.
                This proposed system provides online storage/ updations and retrieval facility. 
                This system promises very less or no paper work and also provides help to blood recipient, blood banks and donors also. In this system everything is stored electronically so very less amount of paper work is required and information can be retrieved very easily without searching here and there into registers.
                This project plays as a vital role in saving life of human beings and which is also its main aim.
                The project Blood Bank Management System is developed so that users can view the information about registered blood donors such as name, address, and other such personal information along with their details of blood group and other medical information of donor.</p>
            <center> <a href="Aboutus.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true" style="color:black;">Know More....</a></center>
          </div>
          <div class="col-md-6" id="banner-col2">
            <img
              class="img-responsive rounded mx-auto d-block"
              src="images/12.jpg"
              alt=""
            />
          </div>
        </div>
      </div>
    </section>
    <hr />
    <!-- product -->
  
   <!-- <section id="product">
      <h1 class="text-center">Our Service</h1>
      <div class="container-fluid" id="product-container">
        <div class="row" id="banner-row">
          <div class="col-md-6" id="about-col">
            <img
              class="img-responsive rounded mx-auto d-block"
              src="images/gfg.png"
              alt=""
            />
          </div>
          <div class="col-md-6" id="product-col2">
            <h3>Product List</h3>
  
            <ul>
              <li>CLINIC MANAGMENT SYSTEM</li>
              <li>SCHOOL/COLLEGE MANAGEMENT 
                  SOFTWARE (CAMPUS PRO)</li>
              <li>SERVICE MANAGEMENT SOFTWARE</li>
              <li>E-COMMERCE WEBSITE</li>
            </ul>
          </div>
        </div>
      </div>
    </section>
    <hr />-->
    <!-- social -->
    <%@include file="card.html"%>
    <section id="social">
      <h1 class="text-center">Get In Touch With Us..</h1>
              <div class="r1" style="width:100%">
           <iframe src="https://www.google.com/maps/embed?pb=!1m23!1m12!1m3!1d14235.665888969916!2d80.99814679730164!3d26.874394760607316!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m8!3e6!4m0!4m5!1s0x399bfd52ffffffff%3A0xf6ea99d140da9929!2sSushma%20Hospital%2C%20C.P.%2C%20102%2C%20Faizabad%20Rd%2C%20Sector%208%2C%20Indira%20Nagar%2C%20Lucknow%2C%20Uttar%20Pradesh%20226016!3m2!1d26.8735482!2d81.0026914!5e0!3m2!1sen!2sin!4v1652379778348!5m2!1sen!2sin" style="width:100%;  height:100%;  border:2px;" ></iframe>
          </div>
          <div class="col-md-4 social-col">
            <a href=""
              ><img
                class="img-responsive rounded mx-auto d-block"
                src="images/icons8-instagram-64.png"
                alt=""
            /></a>
          </div>
          <div class="col-md-4 social-col">
            <a href=""
              ><img
                class="img-responsive rounded mx-auto d-block"
                src="images/icons8-twitter-64.png"
                alt=""
            /></a>
          </div>
    </section>
  
    <!-- footer -->
    <section id="footer">
      <section id="banner">
        <div class="container-fluid" id="banner-container">
          <div class="row" id="banner-row">
            <div class="col-md-4" id="footer-col1">
              <h3>Our Website</h3>
                
<p style="text-align:justify;">
               Our Website helps us to promote good
               supply of blood to needy patients at
               a right time and right position with 
               best quality.
              </p>
  
            </div>
            <div class="col-md-4" id="footer-col2">
              <h3>Contact Us</h3>
                
<p>Call Us- 9621196285</p>
<p>Call Us- 9369300849</p>
 
  
                

<p>Email Us- anushkafeb43@gmail.com</p>

  
            </div>
              <div class="col-md-4" id="footer-col2">
              <h3>Our Services</h3>
                
<p>Donate Blood</p>
  
                
<p>Fulfill patient request</p>
  
            </div>
  
           <!-- <div class="col-md-4" id="footer-col2">
              <h3>Subscribe To Newsletter</h3>
              <form>
                <div class="mb-3">
                  <input type="email" placeholder="Enter Your Email"
                    class="form-control"
                    id="exampleInputEmail1"
                    aria-describedby="emailHelp"/>
                  <div id="emailHelp" 
                       class="form-text">
                    We'll never share your email with anyone else.
                  </div>
                </div>
                <button type="submit" 
                        class="btn btn-primary">
                        Submit
                </button>
              </form>
            </div>-->
          </div>
        </div>
      </section>
    </section>
  
    <!-- Optional JavaScript; choose one of the two! -->
  
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"crossorigin="anonymous">
    </script>
  </body>
</html>