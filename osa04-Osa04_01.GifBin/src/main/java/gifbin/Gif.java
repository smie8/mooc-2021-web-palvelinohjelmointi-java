/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gifbin;

import java.io.File;
import javax.persistence.Entity;
import javax.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author samie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Gif extends AbstractPersistable<Long> {
    
    // we use @Lob to tell db to save the object as big data object
    // this is saved to bigger special location in db, so effectiveness
    // of the db does not suffer because fields are different sizes
    @Lob
    private byte[] content;
}
