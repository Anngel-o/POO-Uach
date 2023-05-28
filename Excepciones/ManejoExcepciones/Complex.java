package Excepciones.ManejoExcepciones;

public class Complex extends FractionsComplexProgram{
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    double real;
    double imaginary;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void getComplex(double r, double i) {
        real = r;
        imaginary = i;
    }

    public Complex sum(Complex obj) throws MyRuntimeException{
        if (obj.getReal() < 0) {
            Complex res = new Complex();
            res.setReal(this.real + obj.getReal());
            res.setImaginary(this.imaginary + obj.getImaginary());
            return res;
        } else {
            MyRuntimeException e = new MyRuntimeException(null, null);
            throw new MyRuntimeException("Sólo introducir números positivos esta vez", e);
        }
    }

    public Complex substract(Complex obj) throws MyError{
        if (obj.getReal() > this.real) {
            Complex res = new Complex();
            res.setReal(this.real - obj.getReal());
            res.setImaginary(this.imaginary - obj.getImaginary());
            return res;
        }
        else {
            throw new MyError("No debe ser un número mayor al introducido");
        }
    }

    public Complex multiply(Complex obj) {
        Complex res = new Complex();
        res.getComplex(((this.real * obj.getReal()) - (this.imaginary * obj.getImaginary())),
                ((this.real * obj.getImaginary()) + (this.imaginary * obj.getReal())));
        return res;
    }

    public Complex divide(Complex obj) throws MyException {
        Complex res = new Complex();
        if ((int)obj.getImaginary() == 0 && (int) obj.getReal() == 0) {
            res.getComplex((((this.real * obj.getReal()) + (this.imaginary * obj.getImaginary())) /
                    ((obj.getReal() * obj.getReal()) + (obj.getImaginary() * obj.getImaginary()))),
                    (((this.real * obj.getImaginary()) - (this.imaginary * obj.getReal())) /
                            ((obj.getReal() * obj.getReal()) + (obj.getImaginary() * obj.getImaginary()))));
        }
        else {
            throw new MyException("Se intenta dividir entre 0.0");
        }
        return res;
    }
}
