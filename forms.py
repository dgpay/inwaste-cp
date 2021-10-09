from flask_wtf import FlaskForm
from wtforms import StringField, SubmitField
from wtforms.validators import DataRequired,Length,Email,EqualTo
from wtforms.fields.html5 import DateField, DateTimeField


class UserForm(FlaskForm):
    fullname = StringField('Full Name', validators=[DataRequired()])
    birthdate = DateTimeField('birthdate',validators=[DataRequired()]) 
    email = StringField('Email', validators=[DataRequired(),Email()])

    submit = SubmitField('SignUp')


