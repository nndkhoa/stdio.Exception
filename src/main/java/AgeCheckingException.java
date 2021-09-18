public class AgeCheckingException extends RuntimeException {
  public AgeCheckingException(String message) {
    super(message);
  }

  @Override
  public String getMessage() {
    return "Tuổi phải từ 18 trở lên.";
  }
}
