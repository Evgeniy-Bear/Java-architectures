package company.print;

public abstract class Decorator implements PrinterInterface{
PrinterInterface component;
public Decorator(PrinterInterface component){
    this.component=component;
}
}
