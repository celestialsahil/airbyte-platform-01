/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.workers.exception

class InvalidChecksumException(message: String) : WorkerException(message) {
  companion object {
    @java.io.Serial
    private const val serialVersionUID: Long = 1L
  }
}
