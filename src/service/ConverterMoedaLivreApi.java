package service;



public record ConverterMoedaLivreApi(String base_code, String target_code, Double conversion_rate, Double conversion_result) {
}