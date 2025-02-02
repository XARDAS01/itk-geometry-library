package academy.itk.model;

import academy.itk.enums.ShapeType;
import academy.itk.service.ShapeService;

public abstract class Shape implements ShapeService {

    protected final ShapeType type;

    public Shape(ShapeType type) {
        this.type = type;
    }

    @Override
    public String shapeDemonstration() {
        return String.format("Shape type: %s perimeter is: %s and area is: %s",
                this.type, this.calculatePerimeter(), this.calculateArea());
    }
}
