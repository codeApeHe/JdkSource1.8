package org.omg.IOP;

/**
* org/omg/IOP/TaggedProfileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u202/12323/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Saturday, December 15, 2018 8:18:18 PM PST
*/

public final class TaggedProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public TaggedProfile value = null;

  public TaggedProfileHolder ()
  {
  }

  public TaggedProfileHolder (TaggedProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TaggedProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TaggedProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TaggedProfileHelper.type ();
  }

}
