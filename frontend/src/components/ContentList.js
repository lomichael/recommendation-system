import React, { useState, useEffect } from 'react';
import { getContents, getRecommendations } from '../services/api';

const ContentList = ({ selectedUser }) => {
    const [contents, setContents] = useState([]);

    useEffect(() => {
        if (selectedUser) {
            getRecommendations(selectedUser).then(response => {
                setContents(response.data);
            }).catch(error => {
                console.error('Error fetching recommendations:', error);
            });
        } else {
            getContents().then(response => {
                setContents(response.data);
            }).catch(error => {
                console.error('Error fetching contents:', error);
            });
        }
    }, [selectedUser]);

    return (
        <div>
            <h2>Contents</h2>
            <ul>
                {contents.map(content => (
                    <li key={content.id}>
                        {content.title} - {content.genre}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ContentList;

