import axios from 'axios';

const API_URL = 'http://localhost:8080/api';

export const getUsers = () => axios.get(`${API_URL}/users`);
export const getContents = () => axios.get(`${API_URL}/contents`);
export const getRecommendations = (user) => axios.post(`${API_URL}/recommend`, user);

