package com.intellij.newCodeFormatting.impl;

import com.intellij.newCodeFormatting.Indent;

class IndentImpl implements Indent {

  static class Type{
    public static final Type NONE = new Type();
    public static final Type LABEL = new Type();
    public static final Type NORMAL = new Type();
    public static final Type CONTINUATION = new Type();
  }

  private final Type myType;
  private final int myCount;
  private final int mySpaces;

  public IndentImpl(final Type type, final int count, final int spaces) {
    myType = type;
    myCount = count;
    mySpaces = spaces;
  }

  Type getType() {
    return myType;
  }

  int getCount() {
    return myCount;
  }

  int getSpaces() {
    return mySpaces;
  }
}
