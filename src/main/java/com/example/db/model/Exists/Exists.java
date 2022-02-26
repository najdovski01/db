package com.example.db.model.Exists;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="exists")
@NoArgsConstructor
@AllArgsConstructor
public class Exists {

    @EmbeddedId
    private ExistsCompositeKey existsCompositeKey;

    public ExistsCompositeKey getExistsCompositeKey() {
        return existsCompositeKey;
    }

    public void setExistsCompositeKey(ExistsCompositeKey existsCompositeKey) {
        this.existsCompositeKey = existsCompositeKey;
    }
}