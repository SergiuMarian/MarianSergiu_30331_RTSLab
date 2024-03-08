package org.example1;

public class Operations {

    private double real1;
    private double imag1;
    private double real2;
    private double imag2;

    public void setReal1(double real1) {
        this.real1 = real1;
    }

    public void setImag1(double imag1) {
        this.imag1 = imag1;
    }

    public void setReal2(double real2) {
        this.real2 = real2;
    }

    public void setImag2(double imag2) {
        this.imag2 = imag2;
    }

    public double getReal1() {
        return real1;
    }

    public double getImag1() {
        return imag1;
    }

    public double getReal2() {
        return real2;
    }

    public double getImag2() {
        return imag2;
    }

    public String sum(double real1, double imag1, double real2, double imag2){

        double sumReal = real1 + real2;
        double sumImag = imag1 + imag2;

        return real1 + " + " + imag1 + "i + " + real2 + " + " + imag2 + "i = " + Math.round(sumReal) + " + " + Math.round(sumImag) + "i";

    }

    public String subtract(double real1, double imag1, double real2, double imag2){

        double sumReal = real1 - real2;
        double sumImag = imag1 - imag2;

        return real1 + " + " + imag1 + "i - " + real2 + " + " + imag2 + "i = " + Math.round(sumReal) + " + " + Math.round(sumImag) + "i";

    }
    public String multiply(double real1, double imag1, double real2, double imag2){

        double sumReal = (real1 * real2) - (imag1 * imag2);
        double sumImag = (imag1*real2) + imag2*real1;

        return real1 + " + " + imag1 + "i * " + real2 + " + " + imag2 + "i = " + Math.round(sumReal) + " + " + Math.round(sumImag) + "i";

    }


}
