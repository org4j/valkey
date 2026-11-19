package io.github.org4j.valkey;

import io.github.org4j.error.StatusThrowable;

public enum ValkeyExceptionStatus implements StatusThrowable {
  VALKEY_UNAVAILABLE,
  VALKEY_INVALID_ARGUMENT,
  VALKEY_LOCK_HELD;

  @Override
  public String getType() {
    return name();
  }
}
