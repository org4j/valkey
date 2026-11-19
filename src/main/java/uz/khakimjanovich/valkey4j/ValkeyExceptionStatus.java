package uz.khakimjanovich.valkey4j;

import uz.khakimjanovich.error4j.StatusThrowable;

public enum ValkeyExceptionStatus implements StatusThrowable {
  VALKEY_UNAVAILABLE,
  VALKEY_INVALID_ARGUMENT,
  VALKEY_LOCK_HELD;

  @Override
  public String getType() {
    return name();
  }
}
