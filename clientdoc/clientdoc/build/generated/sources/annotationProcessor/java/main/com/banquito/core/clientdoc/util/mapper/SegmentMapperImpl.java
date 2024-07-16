package com.banquito.core.clientdoc.util.mapper;

import com.banquito.core.clientdoc.dto.SegmentDTO;
import com.banquito.core.clientdoc.model.Segment;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-12T21:02:38-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
public class SegmentMapperImpl implements SegmentMapper {

    @Override
    public SegmentDTO toDTO(Segment segment) {
        if ( segment == null ) {
            return null;
        }

        SegmentDTO segmentDTO = new SegmentDTO();

        return segmentDTO;
    }

    @Override
    public Segment toPersistence(SegmentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Segment segment = new Segment();

        return segment;
    }
}
