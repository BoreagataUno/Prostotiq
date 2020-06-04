/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;
import nl.fontys.sebivenlo.dao.AbstractMapper;

/**
 *
 * @author HOME
 */
public class InvoiceMapper extends AbstractMapper<Integer, Invoice> {

    public InvoiceMapper() {
        super(Integer.class, Invoice.class);
    }

    @Override
    public Function<Invoice, Integer> keyExtractor() {
        return Invoice::getId;
    }

    @Override
    public String tableName() {
        return "invoice";
    }

}
