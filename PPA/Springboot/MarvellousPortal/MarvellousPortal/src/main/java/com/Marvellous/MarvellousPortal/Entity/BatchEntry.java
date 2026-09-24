package com.Marvellous.MarvellousPortal.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "batches")
public class BatchEntry
{
    @Id
    private long id;
    private String name;
    private int fees;

    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getFees()
    {
        return fees;
    }
    public void setFees(int fees)
    {
        this.fees = fees;
    }

}
