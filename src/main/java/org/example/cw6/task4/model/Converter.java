package org.example.cw6.task4.model;
public interface Converter {
    // интерфейс дает понимание того, что будет происходить в нашем классе,
    // своего рода контракт на какие то действия
    Double convertValue(Double inputValue); // создали метод для конвертации
}
