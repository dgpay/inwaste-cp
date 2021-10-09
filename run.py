from flask import Flask, render_template,url_for
from forms import UserForm
app = Flask(__name__)

app.config['SECRET_KEY'] ='apapunyangtidakbisaditebaktapiapa'

@app.route('/', methods=['GET', 'POST'])
def home():
    form =UserForm()
    return render_template('home.html',title ='User Information Data', form = form)

@app.route('/secondpage')
def secondpage():
    return render_template('second.html')

@app.route('/secondpage1')
def secondpage1():
    return render_template('secondpage1.html')

@app.route('/secondpageasli')
def secondpageasli():
    return render_template('secondpage.html')
    
if __name__ == '__main__':
    app.run(debug=True)