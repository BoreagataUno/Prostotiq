/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import java.util.function.ToIntFunction;
import nl.fontys.sebivenlo.dao.Entity2;
import nl.fontys.sebivenlo.dao.ID;

/**
 *
 * @author HOME
 */
public class Invoice implements Entity2<Integer> {

    @ID
    private Integer invoiceID;
    private Integer vatNumber;
    private Date invoiceDate;
    private String invoicerName;
    private String invoicerSurname;
    private double subTotal;
    private double reduction;
    private double total;
    private boolean paid;
    private Date dueDate;

    public Invoice(int invoiceId, int vatNumber, Date invoiceDate, String invoicerName, String invoicerSurname,
            double subTotal, double reduction, double total, boolean paid, Date dueDate) {
        this.invoiceID = invoiceId;
        this.vatNumber = vatNumber;
        this.invoiceDate = invoiceDate;
        this.invoicerName = invoicerName;
        this.invoicerSurname = invoicerSurname;
        this.subTotal = subTotal;
        this.reduction = reduction;
        this.total = total;
        this.paid = paid;
        this.dueDate = dueDate;
    }
//getter for invoiceID

    @Override
    public Integer getNaturalId() {
        return invoiceID;
    }

    @Override
    public int getId() {
        return invoiceID;
    }

    public void setID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public int getvatNumber() {
        return this.vatNumber;
    }

    public void setvatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    public Date getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoicerName() {
        return this.invoicerName;
    }

    public void setInvoicerName(String invoicerName) {
        this.invoicerName = invoicerName;
    }

    public String getInvoicerSurname() {
        return this.invoicerSurname;
    }

    public void setInvoicerSurname(String invoicerSurname) {
        this.invoicerSurname = invoicerSurname;
    }

    public double getSubTotal() {
        return this.subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getReduction() {
        return this.reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean getPaid() {
        return this.paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
