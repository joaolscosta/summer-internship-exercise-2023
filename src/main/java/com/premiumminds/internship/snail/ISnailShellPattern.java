package com.premiumminds.internship.snail;

import java.util.concurrent.Future;

/**
 * Created by aamado on 05-05-2023.
 */
interface ISnailShellPattern {
  public Future<int[]> getSnailShell(int[][] matrix);
}
