package com.marcos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity //Significa que estamos especificando essa class como uma entidade que vai fazer o mapeamento com banco de dados(vai criar uma tabela "Anomalia")
       //@Table (name = "outroName") caso a tabela já existisse no banco. Porém, como vamos criar com o mesmo nome da class, não precisa.
public class Anomalia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 200, nullable = false)
    private String equipamento;

    @Column(length = 200, nullable = false)
    private String falha;
}
