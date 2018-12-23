package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
/**
 * Created by sergei on 13/12/2018.
 */
    @Getter
    @Setter
    @NoArgsConstructor
    public class IngredientCommand {
        private Long id;
        private String description;
        private BigDecimal amount;
        private UnitOfMeasureCommand uom;

    }

