package com.intellij.newCodeFormatting.impl;

import com.intellij.newCodeFormatting.Alignment;

class AlignmentImpl implements Alignment {
  private int myCurrentOffset = -1;

  static class Type{
    public static final Type FULL = new Type();
    public static final Type NORMAL = new Type();
  }

  private final Type myType;

  public AlignmentImpl(final Type type) {
    myType = type;
  }

  Type getType() {
    return myType;
  }

  int getCurrentOffset() {
    return myCurrentOffset;
  }

  void setCurrentOffset(final int currentIndent) {
    myCurrentOffset = currentIndent;
  }

}
