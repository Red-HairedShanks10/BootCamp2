
import React, { Component } from 'react';
import { Formik, Form, Field, ErrorMessage } from 'formik';

class UserForm extends Component {
constructor(props){
super(props);
}
render(){
return(
<div>
<h1>Any place in your app!</h1>
 <Formik
       initialValues={{ email: '', password: '' }}
       //validate function to validate form values
       validate={values => {
         const errors = {};//intialise error object
         if (!values.email) {
           errors.email = 'Required';//assign Required in errors email if email is empty
         } 
         else if (!/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i.test(values.email)) //if password doesnt adhere to regex pattern rules..
         {
           errors.email = 'Invalid email address';
         } 
         
         else if (values.email.length < 10) {//if email is less than 10 characters... 
            errors.email = 'Email address too short';
            }

            if (!values.password) {//if no password is given...
                errors.password = 'Required';
                }

                else if (values.password.length < 8) {//if password is less than 8...
                errors.password = 'Password too short';
                }
         return errors; //else return errors
       }}
       onSubmit={(values, { setSubmitting }) => {
         setTimeout(() => {
           alert(JSON.stringify(values, null, 2));
           setSubmitting(false);
         }, 400);
       }}
     >
       {({ isSubmitting }) => (
         <Form>
           <Field type="email" name="email" />
           <span style={{ color:"red", fontWeight: "bold" }}>
           <ErrorMessage name="email" component="div" />
           </span>
           
           <Field type="password" name="password" />
           <span style={{ color:"red", fontWeight: "bold" }}>
           <ErrorMessage name="email" component="div" />
           </span>
           <ErrorMessage name="password" component="div" />
           <button type="submit" disabled={isSubmitting}>
             Submit
           </button>
         </Form>
       )}
     </Formik>
   </div>
)
}
}
export default UserForm;