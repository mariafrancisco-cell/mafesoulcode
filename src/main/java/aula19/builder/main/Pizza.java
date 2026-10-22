package aula19.builder.main;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class Pizza {
    private final String sabor;
    private final String borda;
    private final boolean temQueijo;
}
