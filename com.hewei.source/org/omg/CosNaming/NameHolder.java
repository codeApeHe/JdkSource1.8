package org.omg.CosNaming;


/**
* org/omg/CosNaming/NameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u202/12323/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Saturday, December 15, 2018 8:18:17 PM PST
*/


/**
   * A name is a sequence of name components.
   */
public final class NameHolder implements org.omg.CORBA.portable.Streamable
{
  public NameComponent value[] = null;

  public NameHolder ()
  {
  }

  public NameHolder (NameComponent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NameHelper.type ();
  }

}
