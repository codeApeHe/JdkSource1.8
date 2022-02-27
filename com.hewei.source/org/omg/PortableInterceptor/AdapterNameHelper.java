package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/AdapterNameHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u202/12323/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Saturday, December 15, 2018 8:18:18 PM PST
*/


/** The name of an object adapter. This is unique only within
   * the scope of the ORB that created the object adapter.
   */
abstract public class AdapterNameHelper
{
  private static String  _id = "IDL:omg.org/PortableInterceptor/AdapterName:1.0";

  public static void insert (org.omg.CORBA.Any a, String[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.CORBA.StringSeqHelper.id (), "StringSeq", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (AdapterNameHelper.id (), "AdapterName", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String[] read (org.omg.CORBA.portable.InputStream istream)
  {
    String value[] = null;
    value = org.omg.CORBA.StringSeqHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String[] value)
  {
    org.omg.CORBA.StringSeqHelper.write (ostream, value);
  }

}
