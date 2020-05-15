package org.pilus.pojos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PruebaPOJO {

    private ObjectId id;
    @BsonProperty(value="name")
    private String name;
    @BsonProperty(value="summary")
    private String summary;
}
