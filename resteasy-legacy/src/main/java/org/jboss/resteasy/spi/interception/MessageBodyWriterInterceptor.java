package org.jboss.resteasy.spi.interception;

import javax.ws.rs.WebApplicationException;
import java.io.IOException;

/**
 * Wraps around invocations of MessageBodyWriter.writeTo()
 *
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 * 
 * @deprecated The Resteasy interceptor facility introduced in release 2.x
 * is replaced by the JAX-RS 2.0 compliant interceptor facility in release 3.0.x.
 * 
 * @see jaxrs-api (https://jcp.org/en/jsr/detail?id=339)
 * @see javax.ws.rs.ext.WriterInterceptor
 */
@Deprecated
public interface MessageBodyWriterInterceptor
{
   void write(MessageBodyWriterContext context) throws IOException, WebApplicationException;

}
